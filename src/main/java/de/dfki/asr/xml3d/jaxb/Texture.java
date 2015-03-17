/*
 * This file is part of ATLAS. It is subject to the license terms in
 * the LICENSE file found in the top-level directory of this distribution.
 * (Also avialable at http://www.apache.org/licenses/LICENSE-2.0.txt)
 * You may not use this file except in compliance with the License.
 */
package de.dfki.asr.xml3d.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Texture {
	@XmlAttribute
	protected String name;
	@XmlAttribute
	protected String type;
	@XmlAttribute
	protected String filterMin;
	@XmlAttribute
	protected String filterMag;
	@XmlAttribute
	protected String filterMip;
	@XmlAttribute
	protected String wrapS;
	@XmlAttribute
	protected String wrapT;
	@XmlAttribute
	protected String wrapU;
	@XmlElement(name = "img")
	protected Image image;
}
