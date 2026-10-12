# Open-ended gap research (2026-10-12)

Three broad web searches for unmet "is there an app for…" requests. **Result: no validated gap found.**

- Search does not index Reddit threads or tweet-level requests well. Results were dominated by Reddit-client history (Apollo, Alien Blue) and wish-list apps, which are irrelevant.
- Only Android-specific signals found (platform features, not standalone app opportunities):
  - Google Messages: users keep requesting a Trash folder and chat backgrounds ([Android Police](https://www.androidpolice.com/i-tracked-google-messages-feature-requests-what-google-still-ignores/)).
  - Pixel/launcher gaps from a reader poll ([9to5Google](https://9to5google.com/2026/07/03/google-pixel-missing-features-poll-results/)). Weak fit: Google may ship these itself.
- **Play requirement:** new apps and updates must target Android 16 / API 36 from 31 Aug 2026 ([summary](https://stora.sh/blog/2026-04-14-android-api-36-august-deadline-what-to-do-now)). `android/ticket-wallet` currently targets 35 and AGP 8.5.2, so it needs updating (AGP/compileSdk/targetSdk) before any release. Verify on Google's page.

## Conclusion
Open-ended search can't find a real gap. A needed app has to come from a specific person's or community's repeated problem. Next step needs your input (workarounds you've lived, or a community you know).

---

## Round 2: not restricted to apps (2026-10-12)

Evidence-backed demand areas (gaps, not proven businesses). Competitors not yet checked.

1. **Making Tax Digital for Income Tax.** Thresholds: £50k (Apr 2026), £30k (Apr 2027), £20k (Apr 2028); ~1.08M more sole traders/landlords in scope from Apr 2027 ([Drummond Laurie](https://www.drummondlaurie.co.uk/making-tax-digital-for-sole-traders-and-landloards-insight-july-2026-update-270722/), [ByteStart](https://www.bytestart.co.uk/news-insights/864000-sole-traders-and-landlords-face-new-mtd-reporting-rules-from-april-2026/)). Software must be HMRC-approved. Idea: onboarding/"get MTD-ready" service for small sole traders (set-up, migration from spreadsheets, quarterly-update help) rather than building approved software. Concern: crowded with accountants and software vendors.
2. **Finding support for older people and carers.** A third of adult social care users find it hard to find information on services and benefits; ~1.8M people 65+ are unpaid carers ([Age UK](https://www.ageuk.org.uk/latest-press/articles/2-million-older-people-now-have-some-unmet-need-for-social-care/), [JRF](https://www.jrf.org.uk/care/the-future-of-care-needs-a-whole-systems-approach)). Idea: a guided "what support am I entitled to and what do I do next" service for new carers. Check Turn2us, Carers UK, Age UK, gov.uk first.
3. **Small home adaptations (<£1,000).** Grab rails, lever taps, small ramps. Idea: a local fixed-price install service. Physical, local, needs trades and insurance; check Care & Repair, local council schemes.
4. **Digital help for older people.** Trusted in-home tech help. Source is a low-quality listicle; verify demand locally before anything else.

Source quality: the finance/ageing data are primary reports; the "business idea" listicles are unreliable and were not used.

### Honest take
These are real needs, but each has incumbents, and #1 and #2 are the best-evidenced. Next: pick one, then run the Phase 1 competitor and complaint check on it.

---

## Round 3: shovel-seller angle, MTD for accountants (2026-10-12)

Sole traders and landlords are the diggers. Accountants and bookkeepers carry the workload. Findings:

- Core pain is **chasing clients for records each quarter**, not the submissions ([AccountingWeb](https://www.accountingweb.co.uk/community/industry-insights/mtd-didnt-add-tax-work-it-added-the-chasing)). A 200-client practice faces at least 1,000 submission events a year instead of 200 ([Briefcase](https://briefcase.so/blog/mtd-for-itsa-2026-accounting-software-guide)).
- Readiness is poor: only 54% of mandated taxpayers filed Q1, and 70% were still off cloud software, per a Bright survey of 14,000+ practitioners ([Accountancy Age](https://accountancy.age/2026/09/28/the-real-cost-of-unprepared-mtd-clients-accountex-manchester-2026/); URL as returned by search, verify). 45% of 1,000 sole traders felt unprepared, 31% had never heard of MTD (IRIS, via [Accountex](https://www.accountex.co.uk/insight/2025/05/21/mtd-awareness-gap-signals-opportunity-for-accountants/)).
- Capacity is the practices' top worry (36% cite time to become compliant; [Wolters Kluwer](https://www.wolterskluwer.com/en-gb/expert-insights/non-digitalised-clients-key-challenges-mtd-income-tax)).
- **Competitors exist:** FreeAgent, TaxCalc, untied, Capium, Engager, Sage. Practice-management tools already handle deadlines and reminders ([Engager](https://engager.app/practice-management-software-what-to-look-for-2026/)). I found no independent head-to-head reviews, and no count of UK practices.

### Candidate shovel: "MTD Chaser"
A lightweight client-chasing tool for small practices/bookkeepers: sends quarterly record requests by SMS/WhatsApp/email to sole traders, collects receipts and mileage, shows who is outstanding. Works alongside whatever MTD software the practice uses; it does not file with HMRC.
- **Price to test:** £15–40/month per practice.
- **Unvalidated:** whether small practices find existing tools too heavy or expensive. That is what the smoke test and interviews must show.
- Landing page: `landing/mtd-chaser/`.
- Test: 10 conversations with small practices/bookkeepers before any build; waitlist target ≥5% as before.
