package org.openmbee.sdvc.core.dao;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.openmbee.sdvc.json.BaseJson;
import org.openmbee.sdvc.json.CommitJson;

public interface CommitIndexDAO {

    void indexAll(Collection<? extends BaseJson> jsons);

    void index(BaseJson json);

    Optional<CommitJson> findById(String docId);

    List<CommitJson> findAllById(Set<String> docIds);

    void deleteById(String docId);

    void deleteAll(Collection<? extends BaseJson> jsons);

    boolean existsById(String docId);

    List<CommitJson> elementHistory(String id, Set<String> commitIds);

    CommitJson update(CommitJson commitJson);

}
