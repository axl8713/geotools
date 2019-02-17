package org.geotools.data.vpf;

import java.io.IOException;
import org.geotools.data.FeatureReader;
import org.geotools.data.Query;
import org.geotools.data.store.ContentEntry;
import org.geotools.geometry.jts.ReferencedEnvelope;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

/**
 * VPFFeature Source
 *
 * @author James Gambale (Alysida AI)
 */
public class VPFLibFeatureSource extends VPFFeatureSource {

    public VPFLibFeatureSource(ContentEntry entry, Query query) {
        super(entry, query);
    }

    protected FeatureReader<SimpleFeatureType, SimpleFeature> getReaderInternal(Query query)
            throws IOException {

        VPFLibrary vpf = (VPFLibrary) this.getDataStore();
        VPFFeatureType featureType = vpf.getFeatureType(this.entry);
        return new VPFFeatureReader(getState(), featureType);
    }

    protected int getCountInternal(Query query) throws IOException {
        return -1; // feature by feature scan required to count records
    }

    /**
     * Implementation that generates the total bounds (many file formats record this information in
     * the header)
     */
    protected ReferencedEnvelope getBoundsInternal(Query query) throws IOException {
        return null; // feature by feature scan required to establish bounds
    }

    protected SimpleFeatureType buildFeatureType() throws IOException {
        VPFLibrary vpf = (VPFLibrary) this.getDataStore();
        return vpf.getFeatureType(this.entry);
    }
}
