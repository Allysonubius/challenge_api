<h1>Projeto realizado com Java 11 e Spring Boot (Lombook, JPA, SQL)</h1>
<div>
<p>Objetivo de criar aplicação API REST contendo 03 endpoints de uma API EXTERNA</p>

<p>API EXTERNA <a href="http://api-test.bhut.com.br:3000/api-docs/">SWAGGER</a></p>
</div>

<div>
<h3>API EXTERNA A SER CONSUMIDA</h3>
<table>
  <tr>
    <th>METODO</th>
    <th>END POINT</th>
  </tr>
  <tr>
    <td>GET</td>
    <td>api/cars</td>
  </tr>
  <tr>
    <td>POST</td>
    <td>api/cars</td>
  </tr>
</table>
</div>

<div>
<table>
  <tr>
    <th>METODO</th>
    <th>END POINT</th>
    <th>END POINT A CONSUMIR</th>
  </tr>
  <tr>
    <td>GET</td>
    <td>api/listCars</td>
    <td>api/cars</td>
  </tr>
  <tr>
    <td>POST</td>
    <td>api/createCar</td>
    <td>api/cars</td>
  </tr>
</table>
</div>

<div>
<h6>Primeiro serviço: GET api/listCars</h6>
<ul>
<li>Deve retornar na API implementada os dados da API externa.</li>
</ul>
<h6>Segundo serviço: POST api/createCar</h6>
<ul>
<li>Deve criar um registro na API externa usando a API implementada.</li>
<li>Crie uma tabela log com os campos :</li>
<ol>
<li>id</li>
<li>data_hora</li>
<li>car_id</li>
</ol>
<li>Salvar na tabela log as chamadas efetuadas da API</li>
</ul>
<h6>Terceiro serviço: GET api/logs</h6>
<ul>
<li>Deve consultar todos os registros salvos na tabela log.</li>
</ul>
</div>

<div>
<h3>So executar o projeto e aproveite os testes !</h3>
<h6>Para mais informações sobre o banco tudo anotado no arquivo <a href="https://github.com/Allysonubius/challenge_api/blob/master/src/main/resources/application.properties">application.properties</a> </h6>
</div>