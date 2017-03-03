/*
 * PROJECT Mokka7 (fork of Snap7/Moka7)
 *
 * Copyright (c) 2013,2016 Davide Nardella Copyright (c) 2017 J.Zimmermann (comtel2000)
 *
 * All rights reserved. This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Mokka7 is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE whatever license you
 * decide to adopt.
 *
 * Contributors: Davide Nardella - initial API and implementation J.Zimmermann - Mokka7 fork
 *
 */
package org.comtel2000.mokka7.type;

/**
 * PLC area types
 *
 * @author comtel
 *
 */
public enum AreaType {

    /** PE area */
    PE(0x81),

    /** PA area */
    PA(0x82),

    /** Marker area */
    MK(0x83),

    /** DataBlock area */
    DB(0x84),

    /** Counter area */
    CT(0x1C),

    /** Timer area */
    TM(0x1D);

    private final byte value;

    AreaType(int value) {
        this.value = (byte) value;
    }

    public byte getValue() {
        return value;
    }
}
