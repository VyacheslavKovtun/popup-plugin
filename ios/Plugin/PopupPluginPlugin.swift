import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(PopupPluginPlugin)
public class PopupPluginPlugin: CAPPlugin {
    private let implementation = PopupPlugin()

    @objc func echo(_ call: CAPPluginCall) {
        let value = call.getString("value") ?? ""
        call.resolve([
            "value": implementation.echo(value)
        ])
    }


    @objc func showPopup(_ call: CAPPluginCall) {
        var messageText = call.getString("message") ?? ""
        var popupMessage = UIAlertController(title: "Attention", message: messageText, preferredStyle: .alert)

        self.present(popupMessage, animated: true, completion: nil)
        call.resolve([
            "value": messageText
        ])
    }
    
}
