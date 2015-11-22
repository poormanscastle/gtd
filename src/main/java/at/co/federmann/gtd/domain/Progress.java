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
 * defines the status of progress for the given activity, task or project.
 * <p>
 * Created by georg on 21.11.15.
 */
public enum Progress {

    // activity has been created and has not been processed since then
    OPEN(0, "progress.open"),
    // activity has been tackled
    IN_PROGRESS(1, "progress.in_progress"),
    // after having worked on the activity it was postponed to be completed at a later time
    POSTPONED(2, "progress.postponed"),
    // the execution of this task is delayed until some dependency has been taken care of
    WAITING(3, "progress.waiting"),
    // to handle this activity the activiy name and / or description need to be clarified
    CLARIFY(4, "progress.clarify"),
    // this activity will not be handled with for some reason
    REJECTED(5, "progress.rejected"),
    // this activity has become obsolete before it was delt with
    CLOSED(6, "progress.closed"),
    // this activity was delt with in a complete way
    DONE(7, "progress.done"),
    // this activity had to be reopened after it was delt with already
    REOPENED(8, "progress.reopened");

    private final Integer id;

    private final String i18nKey;

    private Progress(Integer id, String i18nKey) {
        this.id = id;
        this.i18nKey = i18nKey;
    }

    public Integer getId() {
        return id;
    }

    public String getI18nKey() {
        return i18nKey;
    }

    public static Progress resolveProgress(Integer id) {
        if (id == null) {
            return null;
        }
        for (Progress progress : Progress.values()) {
            if (id.equals(progress.getId())) {
                return progress;
            }
        }
        throw new IllegalArgumentException(StringUtils.join("No matching Progress found for ID ", id));
    }

}
