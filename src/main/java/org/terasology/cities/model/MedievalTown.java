/*
 * Copyright 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.cities.model;

import javax.vecmath.Point2i;

import org.terasology.cities.model.bldg.TownWall;

import com.google.common.base.Optional;

/**
 * Provides information on a city
 * @author Martin Steiger
 */
public class MedievalTown extends City {

    private TownWall townWall;

    /**
     * @param name the name of the city
     * @param radius the city radius in blocks
     * @param coords the world coordinate in blocks
     */
    public MedievalTown(String name, Point2i coords, int radius) {
        super(name, coords, radius);
    }

    /**
     * @return the town wall, if available
     */
    public Optional<TownWall> getTownWall() {
        return Optional.fromNullable(townWall);
    }
    
    /**
     * @param tw the town wall or <code>null</code> to clear
     */
    public void setTownWall(TownWall tw) {
        this.townWall = tw;
    }
}
