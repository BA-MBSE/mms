package org.openmbee.sdvc.crud.repositories;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BaseClobDAO {

    public Map<String, Object> findByNodeId(String nodeId);

    public Map<String, Object> findByNodeIdAtCommit(String nodeId, String commitId);

    public List<Map<String, Object>> findByNodeIds(Set<String> nodeIds);

    public List<Map<String, Object>> findByNodeIdsAtCommit(Set<String> nodeIds, String commitId);

}
