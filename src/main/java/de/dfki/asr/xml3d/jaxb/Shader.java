/*
 * This file is part of ATLAS. It is subject to the license terms in
 * the LICENSE file found in the top-level directory of this distribution.
 * (Also avialable at http://www.apache.org/licenses/LICENSE-2.0.txt)
 * You may not use this file except in compliance with the License.
 */
package de.dfki.asr.xml3d.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Shader {
	public static final String PHONG   = "urn:xml3d:shader:phong";
	public static final String FLAT    = "urn:xml3d:shader:flat";
	public static final String DIFFUSE = "urn:xml3d:shader:diffuse";

	@XmlAttribute
	protected String id;
	@XmlAttribute
	protected String script;

	@XmlElement(name="float")
	protected FloatValue ambientIntensity;
	@XmlElement(name = "float3")
	protected FloatList diffuseColor;
	@XmlElement(name = "float3")
	protected FloatList specularColor;
	@XmlElement(name = "float3")
	protected FloatList emissiveColor;
	@XmlElement(name = "float3")
	protected FloatList reflectionColor;
	@XmlElement(name = "float")
	protected FloatValue shininess;
	@XmlElement(name = "float")
	protected FloatValue transparency;
	@XmlElement(name = "texture")
	protected List<Texture> textures = new ArrayList<>();
}
