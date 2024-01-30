Feature: Udemy

  Scenario: Udemy sitesine git ve arama yap
    Given Udemy web sitesine git
    When arama kutucuguna tikla
    When yazilim yaz ve ara
    Then Yazilim kuslarinin geldigini kontrol et