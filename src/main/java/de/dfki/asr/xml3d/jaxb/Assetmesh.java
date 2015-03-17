/*
 * This file is part of ATLAS. It is subject to the license terms in
 * the LICENSE file found in the top-level directory of this distribution.
 * (Also avialable at http://www.apache.org/licenses/LICENSE-2.0.txt)
 * You may not use this file except in compliance with the License.
 */
package de.dfki.asr.xml3d.jaxb;

import javax.xml.bind.annotation.*;
import lombok.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Assetmesh {
	@XmlAttribute
	protected String name;

	@XmlAttribute
	protected String type;

	@XmlElement(name="float4x4")
	protected FloatList transform;

	@XmlAttribute
	protected String shader;

	@XmlElement(name="float3")
	protected FloatList position;

	@XmlElement(name="float3")
	protected FloatList normal;

	@XmlElement(name="float2")
	protected FloatList texcoord;

	@XmlElement(name="float3")
	protected FloatList color;

	@XmlElement(name="int")
	protected IntList index;
}
