/*
 *    Copyright 2015 Georg Federmann
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package at.co.federmann.gtd.domain;

import org.apache.commons.lang3.StringUtils;

/**
 * the user can define priorities for her actions, tasks, projects, etc, by assigning one
 * of the enumerated values to the respective item in her GTD.
 * <p>
 * Created by georg on 21.11.15.
 */
public enum Priority {

    // current priority is so low that this action does not need to be taken even if there is no other action waiting
    IGNORE_FOR_NOW(0, "priority.ignore"),
    // execute actions with priorities urgent, high or medium before starting taking this action
    LOW(1, "priority.low"),
    // execute actions with priorities urgent or high before taking this action
    MEDIUM(2, "priority.medium"),
    // execute actions with priority urgent before taking this action
    HIGH(3, "priority.high"),
    // do these actions right away, possibly sorted by due date
    URGENT(4, "priority.urgent");

    /**
     * id of the given priority.
     */
    private final int id;

    /**
     * an id that can be used to look up a label for the given priority from some translation tables.
     */
    private final String i18nKey;

    private Priority(int id, String i18nKey) {
        this.id = id;
        this.i18nKey = i18nKey;
    }

    // this method allows ORM to map int fields to enum items
    public static Priority resolvePriority(Integer id) {
        if (id == null) {
            return null;
        }
        for (Priority priority : Priority.values()) {
            if (id.equals(priority.id)) {
                return priority;
            }
        }
        throw new IllegalArgumentException(StringUtils.join("No matching priority found for id ", id));
    }

    public int getId() {
        return id;
    }

    public String getI18nKey() {
        return i18nKey;
    }
}
