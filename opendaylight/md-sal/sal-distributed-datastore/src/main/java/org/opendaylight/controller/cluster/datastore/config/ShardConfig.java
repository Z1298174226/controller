/*
 * Copyright (c) 2015 Brocade Communications Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.cluster.datastore.config;

import java.util.Set;

/**
 * Encapsulated configuration for a shard.
 */
public class ShardConfig {
    private final String name;
    private final Set<String> replicas;

    public ShardConfig(final String name, final Set<String> replicas) {
        this.name = name;
        this.replicas = replicas;
    }

    public String getName() {
        return name;
    }

    public Set<String> getReplicas() {
        return replicas;
    }
}