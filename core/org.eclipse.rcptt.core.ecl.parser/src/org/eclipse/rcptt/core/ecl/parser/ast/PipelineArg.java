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
package org.eclipse.rcptt.core.ecl.parser.ast;

public class PipelineArg extends Arg {

	public PipelineArg(String text, Pipeline pipeline, int begin, int end) {
		super(text, begin, end);
		this.pipeline = pipeline;
	}

	public final Pipeline pipeline;

	@Override
	public void accept(NodeVisitor visitor) {
		if (visitor.enter(this)) {
			if (name != null) {
				name.accept(visitor);
			}
			pipeline.accept(visitor);
		}
		visitor.exit(this);
	}

}
