/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
@org.osgi.annotation.bundle.Export
@org.osgi.annotation.versioning.Version("1.0.0")
@org.osgi.annotation.bundle.Requirement(namespace = "osgi.ee", filter = "(&(osgi.ee=JavaSE)(version=1.8))")
package org.atomos.service.contract;