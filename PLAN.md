# Android App Plan: Validate-First Approach

## Honest constraints
- **No 99% guarantee of profit exists.** This plan limits risk with cheap, kill-early tests. It does not remove risk.
- **"Brand new, nowhere on Earth" cannot be verified.** Every idea below has partial competitors. The aim is a *gap*: a narrow audience that is badly served, not a novel category.
- Assumptions (not provided): UK-based, solo developer, budget under £500, 10–15 hrs/week. Adjust if wrong.
- Market claims below come from secondary sources. Verify before spending money.

## Shortlisted ideas (pick one after Phase 1 testing)

### A. "Tax Pot" – irregular-income set-aside tracker (UK sole traders / side-hustlers)
- **Problem:** Freelancers with irregular income don't know how much to set aside for Self Assessment and payments on account. Making Tax Digital for Income Tax is phasing in for higher earners from April 2026 (verify current thresholds on gov.uk).
- **Product:** Log income per job or connect via CSV import. The app shows "safe to spend" versus "owed to HMRC", with a deadline calendar and reminders.
- **Competitors to check:** Coconut, Countingup, FreeAgent, QuickBooks Self-Employed. The gap to test is a lightweight, Android-first, no-bookkeeping tool.
- **Pricing:** Free for basics; £3.99/month or £29.99/year for forecasting, exports and reminders.
- **Risk:** Tax-advice liability. Use "estimate only" wording and avoid regulated advice. No bank connections in v1.

### B. "Ticket Wallet" – licence, insurance and certificate expiry tracker for tradespeople
- **Problem:** Sole-trader electricians, gas engineers, scaffolders and similar trades juggle renewals (Gas Safe, NICEIC, CSCS, public liability insurance, DBS). Missed expiries lose jobs.
- **Product:** Photo-scan each document. The app extracts the expiry date, sends reminders at 90/30/7 days, and builds a shareable "compliance pack" link or PDF for clients.
- **Competitors to check:** Generic reminder apps, spreadsheet workflows, and employer-side compliance software (this is aimed at the self-employed instead).
- **Pricing:** Free for 3 documents; £2.99/month for unlimited documents plus sharing.
- **Risk:** Niche size. Reach is via trade Facebook groups and forums, which is cheap but needs testing.

### C. "Move-In Proof" – tenant evidence capture for deposit disputes
- **Problem:** Tenants lose deposit money to disputes because they lack timestamped evidence of the property's condition. Landlord tools are plentiful; tenant-side tools are thin.
- **Product:** Guided room-by-room photo and video capture with tamper-evident timestamps, a check-in/check-out comparison, and a PDF evidence bundle.
- **Competitors to check:** Landlord and letting-agent inventory apps, and the official deposit scheme dispute processes.
- **Pricing:** One-off £4.99 per tenancy, or £9.99 per year.
- **Risk:** Evidence value depends on legal weight. State clearly that it supports a dispute and does not guarantee a result.

## Phases and go/no-go gates

### Phase 1 – Competitor and demand check (weeks 1–2, £0)
For each idea:
1. Search Play Store, Product Hunt and Google for direct competitors. Record ratings, review counts and 1–3★ complaints.
2. Search Reddit and forums for the pain point. Keep links to at least 10 real complaints per idea.
3. Check keyword volume for 5 relevant search terms.
**Gate:** Drop any idea with a dominant, well-reviewed, cheap competitor, or fewer than 10 real complaints.

### Phase 2 – Smoke test (weeks 3–4, under £100)
1. Build a one-page site per surviving idea (free host plus a £10 domain) with a clear promise and a waitlist or pre-order button.
2. Spend up to £50 per idea on targeted ads, plus posts in relevant communities.
**Gate:** At least 5% of visitors sign up, or at least 10 people pre-commit. Choose the best performer. If none pass, return to Phase 1 with new ideas.

### Phase 3 – Google Play setup (parallel with Phase 2)
- Pay the one-off $25 developer fee.
- A new personal account must run a **closed test with at least 12 opted-in testers for 14 continuous days** before production access ([Google's help page](https://support.google.com/googleplay/android-developer/answer/14151465?hl=en-GB)). Recruit these testers from the waitlist.

### Phase 4 – MVP (weeks 5–10)
- Stack: Kotlin, Jetpack Compose, Room (local-first), Play Billing via RevenueCat, Firebase Analytics and Crashlytics.
- Ship one core workflow only, with the paywall in the first release.
- Privacy policy and data-safety form completed before submission.

### Phase 5 – Launch and measure (weeks 11–22)
Track weekly: installs, install-to-trial, trial-to-paid, day-7 and day-30 retention, refunds, and revenue per install.
- Benchmarks for context: hard paywalls show about 10.7% median day-35 trial-to-paid; freemium about 2.1% ([RevenueCat via SaaStr](https://www.saastr.com/the-top-10-learnings-from-revenuecats-state-of-subscription-apps/)). Cross-category figures, so treat them as rough.
- **Kill or scale at week 22:** if monthly revenue doesn't cover running costs and the trend is flat, stop and move to the next idea.

## Budget (approximate)
| Item | Cost |
|---|---|
| Play developer fee | about £20 |
| Domains and hosting | £20–40 |
| Test ads | £100–150 |
| Tools (RevenueCat free tier, Firebase free tier) | £0 |
| **Total before launch** | **about £150–250** |

## Revenue sense-check (illustrative, not a forecast)
At £30/year per paying user, 500 paying users is £15,000/year before Google's fee (15% on subscriptions) and tax. Reaching that depends entirely on acquisition, which Phase 2 tests.

## Immediate next steps
1. Run Phase 1 for ideas A, B and C.
2. Confirm your skills, budget and time so the ideas can be re-ranked.

---

## Phase 1 findings (2026-10-12)

Desk research only: a few web searches, no review mining, no Reddit/forum counts, no keyword volumes. The Phase 1 gate (10 real complaints per idea, keyword volume) is **not yet met for any idea**. Treat the results as leads.

| Idea | Competitors found | Gap signal | Verdict |
|---|---|---|---|
| A. Tax Pot | [Coconut](https://www.capterra.com/p/184322/Coconut/) (monthly set-aside recommendation, 30+ UK banks, 30-day trial); Countingup, FreeAgent (not verified) | Weak. Coconut already does set-aside. | Lowest priority. Needs a clear differentiator. |
| B. Ticket Wallet | [Trade2Base](https://www.trade2base.com/help/manage-certs) (Gas Safe/NICEIC/CSCS expiry alerts at 60/30 days, but per-engineer/team); [Powered Now](https://powerednow.com/?p=12718) (certificates issued to customers); landlord tools (PaTMa, August) | Moderate. Existing tools are team/employer or job-management products. No result showed a lightweight solo-trader tracker covering public liability insurance. | Best candidate for smoke test. |
| C. Move-In Proof | [Shelter Scotland Housemate](https://www.scotsman.com/news/introducing-the-latest-weapon-against-bad-landlords-the-ihome-1609932) (free iPhone app, old article; current status unverified); landlord/agent inventory vendors | Moderate on Android. Guidance confirms timestamped photos and tenant sign-off matter ([MyDeposits](https://mydeposits.co.uk/?p=4654), [Shelter](https://england.shelter.org.uk/housing_advice/tenancy_deposits/how_to_get_your_deposit_back/evidence_deposit_dispute)). | Smoke-test candidate. Concern: one-off purchase, seasonal, low lifetime value. |

### Recommendation
Run the Phase 2 smoke test on **B** and **C**, and drop **A** unless a differentiator from Coconut emerges.

### Still to do before spending on ads
1. Mine 1-3 star reviews on the Play Store for Trade2Base and other competitors (needs store access; web search could not return them).
2. Collect 10+ real complaint links per idea from Reddit (r/electricians, r/UKPersonalFinance, r/HousingUK) and trade Facebook groups.
3. Check keyword volume for terms like "gas safe renewal reminder", "CSCS card expiry", "tenancy deposit evidence app".
