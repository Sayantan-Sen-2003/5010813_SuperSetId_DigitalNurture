public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        // Adding SMS notification functionality
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Adding Slack notification functionality
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send notification through multiple channels
        slackNotifier.send("This is a test message.");
    }
}

// output
// Sending email notification: This is a test message.
// Sending SMS notification: This is a test message.
// Sending Slack notification: This is a test message.