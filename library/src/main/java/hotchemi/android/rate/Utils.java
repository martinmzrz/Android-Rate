package hotchemi.android.rate;

import android.content.Context;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

final class Utils {

    private Utils() {
    }

    static MaterialAlertDialogBuilder getDialogBuilder(Context context) {
        return new MaterialAlertDialogBuilder(context);
    }

}
