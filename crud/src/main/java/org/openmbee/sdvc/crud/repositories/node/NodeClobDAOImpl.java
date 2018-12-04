package org.openmbee.sdvc.crud.repositories.node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openmbee.sdvc.crud.repositories.BaseClobDAOImpl;
import org.springframework.stereotype.Component;

@Component
public class NodeClobDAOImpl extends BaseClobDAOImpl implements NodeClobDAO {

    @Override
    public Map<String, Object> findByNodeId(String nodeId) {
        String sql = "SELECT * FROM nodeblob WHERE id = ?";

        return new HashMap<>();
    }

    @Override
    public List<Map<String, Object>> findByNodeIds(Set<String> nodeIds) {
        return new ArrayList<>();
    }
}
