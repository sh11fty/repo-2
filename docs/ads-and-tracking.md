# Phase 2 smoke test: ads and tracking

Budget: up to £50 per idea, 7–10 days. Run both ideas at the same time so results are comparable.

## Tracking
- Add UTM parameters to every ad URL: `?utm_source=<platform>&utm_campaign=<idea>-v1&utm_content=<ad-id>`.
- Use a privacy-friendly analytics tool (e.g. Plausible or Cloudflare Web Analytics) for visits.
- Signups = form submissions. Sign-up rate = signups ÷ unique visitors.
- Pass mark (from PLAN.md): ≥5% sign-up rate, or ≥10 pre-commitments.
- Sample size note: below ~200 visitors per idea the rate is too noisy to decide on.

## Ticket Wallet
- **Audience:** UK sole-trader electricians, gas engineers, plumbers, scaffolders. Facebook/Meta interests: "Electrician", "Plumbing", "Gas Safe"; or posts in trade groups (read group rules first; many ban promotion).
- **Ad 1:** "Missed a CSCS or insurance renewal? Never again. Track every ticket in one Android app. Join the waitlist."
- **Ad 2:** "Clients asking for proof of cover? Share a compliance pack in seconds. Waitlist open."
- **Landing page:** `landing/ticket-wallet/`

## Move-In Proof
- **Audience:** UK renters aged 18–35, searching "tenancy deposit", "inventory", "deposit dispute" (Google Search ads, UK).
- **Ad 1:** "Getting your deposit back starts on day one. Timestamped move-in evidence. Waitlist open."
- **Ad 2:** "Landlord disputing your deposit? Be ready with room-by-room proof."
- **Landing page:** `landing/move-in-proof/`

## Rules
- No fake testimonials, user counts or "available now" claims. The app does not exist yet.
- Stop an ad set early if it spends £20 with zero signups.
- Record results in `docs/results.csv`.
