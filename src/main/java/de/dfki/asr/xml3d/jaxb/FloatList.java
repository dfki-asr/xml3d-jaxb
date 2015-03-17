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
import lombok.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class FloatList{

	@NonNull
	@XmlAttribute
	protected String name;

	@XmlList
	@XmlValue
	protected List<Float> values = new ArrayList<>();

	public void add(Float value){
		values.add(value);
	}

}
