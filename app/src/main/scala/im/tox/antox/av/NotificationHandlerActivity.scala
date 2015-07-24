package im.tox.antox.av

import android.app.Activity
import android.content.{BroadcastReceiver, Context, Intent, IntentFilter}
import im.tox.antox.utils.Constants

class NotificationHandlerActivity extends Activity {

  val callReceiver = new BroadcastReceiver() {

    override def onReceive(context: Context, intent: Intent) {
      val actionName = intent.getAction
      println("we got close")
      if (actionName.equals(Constants.END_CALL)) {
        // call your method here and do what ever you want.
        println("this might have worked")
      }
    }
  }

  registerReceiver(callReceiver, new IntentFilter("call_method"))
}