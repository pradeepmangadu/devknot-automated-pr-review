# devknot-automated-pr-review

Dev Knot tutorial demonstration project. Requires Java 17 and Maven.

## Run
`mvn spring-boot:run`

## Create the intentionally flawed demo PR
1. Push this baseline project to a new GitHub repository on `main`.
2. `git checkout -b demo/introduce-review-bugs`
3. Copy `demo-changes/PriceService.java` over `src/main/java/com/devknot/demo/PriceService.java`.
4. `git add . && git commit -m "Demo: introduce code review findings"`
5. `git push -u origin demo/introduce-review-bugs` and open a PR targeting `main`.

The demo code deliberately contains flaws. Never use it for real authentication or production.
