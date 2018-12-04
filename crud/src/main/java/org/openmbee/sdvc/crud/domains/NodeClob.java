package org.openmbee.sdvc.crud.domains;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "nodeclob")
public class NodeClob {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY,
        cascade = CascadeType.ALL)
    private Node nodeId;

    @ManyToOne(fetch = FetchType.LAZY,
        cascade = CascadeType.ALL)
    private Commit commitId;

    @Lob
    @Column(name = "json", columnDefinition = "CLOB")
    private String json;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Node getNodeId() {
        return nodeId;
    }

    public void setNodeId(Node nodeId) {
        this.nodeId = nodeId;
    }

    public Commit getCommitId() {
        return commitId;
    }

    public void setCommitId(Commit commitId) {
        this.commitId = commitId;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

}
