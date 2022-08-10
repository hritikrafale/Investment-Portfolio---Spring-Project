FROM openjdk:17
EXPOSE 8081
ADD out/artifacts/InvestmentPortfolio_jar/InvestmentPortfolio.jar InvestmentPortfolio.jar
ENTRYPOINT ["java","-jar","/InvestmentPortfolio.jar"]