package org.openmbee.sdvc.sysml.services;

import java.util.Map;
import org.openmbee.sdvc.crud.controllers.elements.ElementsRequest;
import org.openmbee.sdvc.crud.controllers.elements.ElementsResponse;
import org.openmbee.sdvc.crud.repositories.edge.EdgeDAO;
import org.openmbee.sdvc.crud.services.DefaultNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sysmlNodeService")
public class SysmlNodeService extends DefaultNodeService {

    private EdgeDAO edgeRepository;

    @Autowired
    public void setEdgeRepository(EdgeDAO edgeRepository) {
        this.edgeRepository = edgeRepository;
    }

    @Override
    public ElementsResponse get(String projectId, String refId, String id,
        Map<String, String> params) {
        return super.get(projectId, refId, id, params);
    }

    @Override
    public ElementsResponse post(String projectId, String refId, ElementsRequest req,
        Map<String, String> params) {
        return super.post(projectId, refId, req, params);
    }

}
