package gov.hhs.onc.phiz.destination.impl;

import gov.hhs.onc.phiz.data.db.impl.AbstractPhizEntity;
import gov.hhs.onc.phiz.destination.PhizDestination;
import java.net.URI;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Cacheable
@Entity(name = "dest")
@Table(name = "destinations")
public class PhizDestinationImpl extends AbstractPhizEntity<String> implements PhizDestination {
    private URI uri;

    public PhizDestinationImpl() {
    }

    public PhizDestinationImpl(String id, URI uri) {
        this.id = id;
        this.uri = uri;
    }

    @Column(name = "dest_id", nullable = false)
    @Id
    @Override
    public String getId() {
        return super.getId();
    }

    @Column(name = "dest_uri", nullable = false)
    @Override
    public URI getUri() {
        return this.uri;
    }

    @Override
    public void setUri(URI uri) {
        this.uri = uri;
    }
}
