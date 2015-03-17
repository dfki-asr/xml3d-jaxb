/*
 * This file is part of ATLAS. It is subject to the license terms in
 * the LICENSE file found in the top-level directory of this distribution.
 * (Also avialable at http://www.apache.org/licenses/LICENSE-2.0.txt)
 * You may not use this file except in compliance with the License.
 */
package de.dfki.asr.xml3d.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement(name = "xml3d", namespace = "http://www.xml3d.org/2009/xml3d")
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class XML3D {
	@XmlElement
	protected Defs defs;

	@XmlElement
	protected Group group;
}
