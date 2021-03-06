/*******************************************************************************
 * Copyright (c) 2009, 2014 Xored Software Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Xored Software Inc - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.rcptt.core.model.index;

import org.eclipse.rcptt.core.model.IQ7NamedElement;
import org.eclipse.rcptt.internal.core.model.index.Index;

public interface IIndexDocument {

	String getContainerRelativePath();

	IQ7NamedElement getElement();

	void addKey(String key, String value);

	void updateModificationStamp(long stamp);
	
	Index getIndex();

	void remove();
}