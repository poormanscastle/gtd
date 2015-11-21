package at.co.federmann.gtd.domain;

/**
 * defines the status of progress for the given activity, task or project.
 * <p>
 * Created by georg on 21.11.15.
 */
public enum Progress {

    // OPEN, IN_PROGRESS, POSTPONED, WAITING, CLARIFY, REJECTED, CLOSED, DONE, REOPENED
    OPEN(0, "progress.open");

    private final Integer id;

    private final String i18nKey;

    private Progress(Integer id, String i18nKey) {
        this.id = id;
        this.i18nKey = i18nKey;
    }

}
