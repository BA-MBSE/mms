package org.openmbee.sdvc.jcr.config;

import java.io.File;
import java.io.IOException;
import javax.jcr.Repository;
import org.apache.jackrabbit.oak.Oak;
import org.apache.jackrabbit.oak.blob.cloud.s3.S3DataStore;
import org.apache.jackrabbit.oak.jcr.Jcr;
import org.apache.jackrabbit.oak.segment.SegmentNodeStoreBuilders;
import org.apache.jackrabbit.oak.segment.file.FileStore;
import org.apache.jackrabbit.oak.segment.file.FileStoreBuilder;
import org.apache.jackrabbit.oak.segment.file.InvalidFileStoreVersionException;
import org.apache.jackrabbit.oak.spi.state.NodeStore;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public abstract class JcrRepositoryFactory implements ApplicationContextAware {

    protected final Logger logger = LogManager.getLogger(getClass());

    private ApplicationContext context;

    public void setApplicationContext(ApplicationContext context) {
        this.context = context;
    }

    public Repository getRepository() {
        return getRepository("Default");
    }

    public Repository getRepository(String type) {
        if (logger.isDebugEnabled()) {
            logger.debug("Getting NodeStore bean of type: {}", type);
        }
        NodeStore ns = (NodeStore) context.getBean(type + "NodeStore");
        return new Jcr(new Oak(ns)).createRepository();
    }

    @Bean(name = "DefaultNodeStore")
    public NodeStore getDefaultNodeStore() throws InvalidFileStoreVersionException, IOException {
        FileStore fs = FileStoreBuilder.fileStoreBuilder(new File("repository")).build();
        return SegmentNodeStoreBuilders.builder(fs).build();
    }

    @Bean(name = "S3NodeStore")
    public NodeStore getS3NodeStore() throws InvalidFileStoreVersionException, IOException {
        S3DataStore s3ds = new S3DataStore();
        FileStore fs = FileStoreBuilder.fileStoreBuilder(new File("repository")).build();
        return SegmentNodeStoreBuilders.builder(fs).build();
    }
}
