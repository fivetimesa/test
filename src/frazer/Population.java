/*
 * Copyright (C) 2017 Teodor Michalski, Maciek Bajor, Paweł Sikorski
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package frazer;

import frazer.interfaces.Mating;

/**
 *
 * @author Teodor Michalski, Maciek Bajor, Paweł Sikorski
 */
public class Population {

    int count;
    Specimen[] specimens;

    /**
     *
     * @param populationCount
     * @param geneCount
     * @param geneType
     */
    public Population(int populationCount, int geneCount, byte geneType) {
        this.count = populationCount;
        specimens = new Specimen[populationCount];
        for (int i = 0; i < populationCount; i++) {
            specimens[i] = new Specimen(geneCount, geneType);
        }
    }

    /**
     *
     * @param specimens
     */
    public Population(Specimen[] specimens) {
        this.specimens = specimens;
        this.count = specimens.length;
    }

    /* STATIC PRIVATE CLASSES */
    static private class RouletteWheelMating implements Mating {

        @Override
        public Specimen[] selectParent(Specimen[] specimens) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    static private class TournamentMating implements Mating {

        @Override
        public Specimen[] selectParent(Specimen[] specimens) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    static private class CrossoverBreeding implements Mating {

        @Override
        public Specimen[] selectParent(Specimen[] specimens) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    static private class ExtrapolatedBreeding implements Mating {

        @Override
        public Specimen[] selectParent(Specimen[] specimens) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}
