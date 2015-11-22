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
 * defines the status of an activity, task, project, etc. as a color code: green for "ok", yellow for "needs attention",
 * red for "oh boy".
 * <p>
 * Created by georg on 21.11.15.
 */
public enum Status {

    GREEN(0, "status.green"), YELLOW(1, "status.yellow"), RED(2, "status.red");

    /**
     * some id.
     */
    private final int id;

    /**
     * used to look up a label text from i18n translation mechanisms.
     */
    private final String i18nKey;

    private Status(int id, String i18nKey) {
        this.id = id;
        this.i18nKey = i18nKey;
    }

    public int getId() {
        return id;
    }

    public String getI18nKey() {
        return i18nKey;
    }

    // this method allows ORM to map int fields to enum items
    public static Status resolveStatus(Integer id) {
        if (id == null) {
            return null;
        }
        for (Status status : Status.values()) {
            if (id.equals(status.id)) {
                return status;
            }
        }
        throw new IllegalArgumentException(StringUtils.join("No mathing Status found for id ", id));
    }
}
