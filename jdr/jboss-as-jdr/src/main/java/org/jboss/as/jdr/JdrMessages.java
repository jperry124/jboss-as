/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.jdr;

import org.jboss.logging.annotations.Message;
import org.jboss.logging.annotations.MessageBundle;
import org.jboss.logging.Messages;

/**
 * This module is using message IDs in the range 13100-13199. This file is using the subset 13150-13199 for
 * non-logger messages. See http://community.jboss.org/docs/DOC-16810 for the full list of currently reserved
 * JBAS message id blocks.
 *
 * @author Mike M. Clark
 * @author Jesse Jaggars
 */
@MessageBundle(projectCode = "JBAS")
interface JdrMessages {
    /**
     * The messages
     */
    JdrMessages MESSAGES = Messages.getBundle(JdrMessages.class);

    @Message(id = 13150, value = "JBoss Home directory cannot be determined.")
    String jbossHomeNotSet();

    /**
     * Indicates an invalid, <code>null</code> argument was
     * passed into a method.
     *
     * @param var method variable that was <code>null</code>
     * @return Exception describing the invalid parameter.
     */
    @Message(id = 13151, value = "Parameter %s may not be null.")
    IllegalArgumentException varNull(String var);

    @Message(id = Message.NONE, value = "Display this message and exit")
    String jdrHelpMessage();

    @Message(id = Message.NONE, value = "hostname that the management api is bound to. (default: localhost)")
    String jdrHostnameMessage();

    @Message(id = Message.NONE, value = "port that the management api is bound to. (default: 9990)")
    String jdrPortMessage();
}
