package org.openmbee.sdvc.crud.services;

import org.openmbee.sdvc.crud.repositories.commit.CommitDAO;
import org.openmbee.sdvc.crud.repositories.commit.CommitClobDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommitService {

    private CommitDAO commitRepository;
    private CommitClobDAO commitElasticRepository;

    @Autowired
    public void setCommitDao(CommitDAO commitDao) {
        this.commitRepository = commitDao;
    }

    @Autowired
    public void setCommitElasticDao(CommitClobDAO commitElasticRepository) {
        this.commitElasticRepository = commitElasticRepository;
    }

}
