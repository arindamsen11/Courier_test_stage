$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature1.feature");
formatter.feature({
  "line": 1,
  "name": "Test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test web apps",
  "description": "",
  "id": "test;test-web-apps",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to the url",
  "keyword": "Given "
});
formatter.match({
  "location": "Test1.navigate_to_the_url()"
});
formatter.result({
  "duration": 13899304954,
  "status": "passed"
});
});