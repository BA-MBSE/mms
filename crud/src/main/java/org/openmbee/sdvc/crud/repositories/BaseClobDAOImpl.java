package org.openmbee.sdvc.crud.repositories;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openmbee.sdvc.crud.config.DbContextHolder;

public abstract class BaseClobDAOImpl extends BaseDAOImpl implements BaseClobDAO {

    public String getIndex() {
        return DbContextHolder.getContext().getIndex();
    }

    public Map<String, Object> findByNodeId(String nodeId) {
        return null;
    }


    public Map<String, Object> findByNodeIdAtCommit(String nodeId, String commitId) {
        return null;
    }

    public List<Map<String, Object>> findByNodeIds(Set<String> nodeIds) {
        return null;
    }

    public List<Map<String, Object>> findByNodeIdsAtCommit(Set<String> nodeIds, String commitId) {
        return null;
    }
}
