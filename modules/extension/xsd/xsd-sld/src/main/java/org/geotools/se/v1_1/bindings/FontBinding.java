/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2002-2010, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.se.v1_1.bindings;

import javax.xml.namespace.QName;
import org.geotools.api.filter.FilterFactory;
import org.geotools.api.style.StyleFactory;
import org.geotools.se.v1_1.SE;
import org.geotools.sld.bindings.SLDFontBinding;

/**
 * Binding object for the element http://www.opengis.net/se:Font.
 *
 * <p>
 *
 * <pre>
 *  <code>
 *  &lt;xsd:element name="Font" type="se:FontType"&gt;
 *      &lt;xsd:annotation&gt;
 *          &lt;xsd:documentation&gt;
 *          A "Font" element specifies the text font to use.  The allowed
 *          SvgParameters are: "font-family", "font-style", "font-weight",
 *          and "font-size".
 *        &lt;/xsd:documentation&gt;
 *      &lt;/xsd:annotation&gt;
 *  &lt;/xsd:element&gt;
 *
 *   </code>
 * </pre>
 *
 * @generated
 */
public class FontBinding extends SLDFontBinding {

    public FontBinding(StyleFactory styleFactory, FilterFactory filterFactory) {
        super(styleFactory, filterFactory);
    }

    /** @generated */
    @Override
    public QName getTarget() {
        return SE.Font;
    }
}
