# Google Play launch checklist

- [ ] Create a Play Console developer account (one-off $25 fee; needs the account holder's ID and payment details)
- [ ] Decide personal vs organisation account. Personal accounts must run a closed test with ≥12 opted-in testers for 14 continuous days before production access ([Google help](https://support.google.com/googleplay/android-developer/answer/14151465)). Verify current rules.
- [ ] Recruit ≥12 testers from the waitlist (aim for 20 to allow for dropouts)
- [ ] Generate an upload key; enable Play App Signing
- [ ] Build a signed release bundle (`./gradlew bundleRelease`)
- [ ] Complete the Data safety form (see `docs/privacy-policy-template.md`)
- [ ] Publish a privacy policy at a public URL
- [ ] Complete content rating questionnaire and target audience
- [ ] Store listing: title, short and full descriptions, 512px icon, feature graphic, ≥2 phone screenshots
- [ ] Configure subscriptions/in-app products in Play Billing; link RevenueCat if used
- [ ] Run the closed test for 14 days, fix crashes, then apply for production access
