/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.api.resource;

import java.util.Locale;

import org.opentripplanner.api.common.Message;

import junit.framework.TestCase;

public class TestMessages extends TestCase {

    public void testLanguagesDefaultLocale() {
        // Force default to make test work on non-US machines
        Locale.setDefault(new Locale("en", "US"));

        String e = Message.GEOCODE_FROM_AMBIGUOUS.get();

        TestCase.assertNotNull(e);
    }

    public void testLanguagesEnumLocale() {
        // Force default to make test work on non-US machines
        Locale.setDefault(new Locale("en", "US"));

        String f = Message.GEOCODE_FROM_AMBIGUOUS.get(Locale.CANADA_FRENCH);

        TestCase.assertNotNull(f);
    }

    public void testLanguagesNewLocale() {
        // Force default to make test work on non-US machines
        Locale.setDefault(new Locale("en", "US"));

        String s = Message.GEOCODE_FROM_AMBIGUOUS.get(new Locale("es"));

        TestCase.assertNotNull(s);
    }

    public void testLanguagesNotSame(){
        // Force default to make test work on non-US machines
        Locale.setDefault(new Locale("en", "US"));

        String e = Message.GEOCODE_FROM_AMBIGUOUS.get();
        String f = Message.GEOCODE_FROM_AMBIGUOUS.get(Locale.CANADA_FRENCH);
        String s = Message.GEOCODE_FROM_AMBIGUOUS.get(new Locale("es"));

        TestCase.assertNotSame(e, f);
        TestCase.assertNotSame(e, s);
        TestCase.assertNotSame(f, s);
    }
}
