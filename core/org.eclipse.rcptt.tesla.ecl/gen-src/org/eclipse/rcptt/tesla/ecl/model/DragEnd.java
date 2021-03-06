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
package org.eclipse.rcptt.tesla.ecl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drag End</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.rcptt.tesla.ecl.model.TeslaPackage#getDragEnd()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Emulates drag end event.' returns='value of <code>control</code> parameter' example='with [get-view \"Project Explorer\" | get-tree] {\n    drag-end -detail copy\n    select \"Project/Folder/t.test\" | get-menu Delete | click\n}'"
 * @generated
 */
public interface DragEnd extends DragAction {
} // DragEnd
