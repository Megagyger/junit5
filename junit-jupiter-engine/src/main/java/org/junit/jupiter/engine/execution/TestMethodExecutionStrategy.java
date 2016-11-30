/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.jupiter.engine.execution;

import java.util.function.Consumer;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;

public interface TestMethodExecutionStrategy {

	ConditionEvaluationResult evaluateConditions(JupiterEngineExecutionContext context);

	void execute(JupiterEngineExecutionContext context, Consumer<JupiterEngineExecutionContext> executor);

}
