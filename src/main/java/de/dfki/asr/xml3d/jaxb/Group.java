/*
 * This file is part of ATLAS. It is subject to the license terms in
 * the LICENSE file found in the top-level directory of this distribution.
 * (Also avialable at http://www.apache.org/licenses/LICENSE-2.0.txt)
 * You may not use this file except in compliance with the License.
 */
package de.dfki.asr.xml3d.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement(name = "group", namespace = "http://www.xml3d.org/2009/xml3d")
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Group {
	@XmlID
	@XmlAttribute
	protected String id;

	@XmlElementRefs({
		@XmlElementRef(name = "group", type = Group.class, required = false),
		@XmlElementRef(name = "model", type = Model.class, required = false)
	})
	protected List<Object> groupsAndAssetRefs = new ArrayList<>();
}
