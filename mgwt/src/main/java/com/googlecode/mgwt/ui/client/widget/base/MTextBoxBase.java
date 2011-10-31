/*
 * Copyright 2011 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.ui.client.widget.base;

import com.google.gwt.user.client.ui.ValueBoxBase;
import com.googlecode.mgwt.ui.client.theme.base.InputCss;

/**
 * BaseClass for textboxes
 * 
 * @author kurt
 * 
 */
public class MTextBoxBase extends MValueBoxBase<String> {

	protected MTextBoxBase(InputCss css, ValueBoxBase<String> box) {
		super(css, box);
	}

	/*
	 * (non-Javadoc)
	 * @see com.googlecode.mgwt.ui.client.widget.base.MValueBoxBase#getValue()
	 */
	@Override
	public String getValue() {
		String raw = super.getValue();
		return raw == null ? "" : raw;
	}

}
