<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>AppPedido</title>
</head>
<body>
	<div class="contain er mt-3">
		<h2>AppPedido</h2>
		<p>Projeto de aplicação para restaurante</p>

		<h3>Classe: Pedido</h3>
		<table class="table table-dark table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>descicao</td>
					<td>String</td>
					<td>Descrição do pedido</td>
				</tr>
				<tr>
					<td>data</td>
					<td>LocalDateTime</td>
					<td>Data de realização do pedido</td>
				</tr>
				<tr>
					<td>web</td>
					<td>boolean</td>
					<td>Indicativo para um pedido online ou presencial</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="contain er mt-3">
		<h3>Classe: Produto</h3>
		<table class="table table-dark table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>descricao</td>
					<td>String</td>
					<td>Descrição do Produto</td>
				</tr>
				<tr>
					<td>data</td>
					<td>LocalDateTime</td>
					<td>Data de realização do pedido</td>
				</tr>
				<tr>
					<td>web</td>
					<td>boolean</td>
					<td>Indicativo para um pedido online ou presencial</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="contain er mt-3">
		<h3>Classe: Bebida</h3>
		<table class="table table-dark table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>descricao</td>
					<td>String</td>
					<td>Descrição do Bebida</td>
				</tr>
				<tr>
					<td>data</td>
					<td>LocalDateTime</td>
					<td>Data de realização do pedido</td>
				</tr>
				<tr>
					<td>web</td>
					<td>boolean</td>
					<td>Indicativo para um pedido online ou presencial</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="contain er mt-3">
			<h3>Classe: Comida</h3>
			<table class="table table-dark table-striped">
				<thead>
					<tr>
						<th>Atributo</th>
						<th>Tipo</th>
						<th>Descrição</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>descicao</td>
						<td>String</td>
						<td>Descrição do comida</td>
					</tr>
					<tr>
						<td>data</td>
						<td>LocalDateTime</td>
						<td>Data de realização do pedido</td>
					</tr>
					<tr>
						<td>web</td>
						<td>boolean</td>
						<td>Indicativo para um pedido online ou presencial</td>
					</tr>
				</tbody>
			</table>
		</div>
		
		<div class="contain er mt-3">
			<h3>Classe: Sobremesa</h3>
			<table class="table table-dark table-striped">
				<thead>
					<tr>
						<th>Atributo</th>
						<th>Tipo</th>
						<th>Descrição</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>descicao</td>
						<td>String</td>
						<td>Descrição da sobremesa</td>
					</tr>
					<tr>
						<td>data</td>
						<td>LocalDateTime</td>
						<td>Data de realização do pedido</td>
					</tr>
					<tr>
						<td>web</td>
						<td>boolean</td>
						<td>Indicativo para um pedido online ou presencial</td>
					</tr>
				</tbody>
			</table>
		</div>
<div class="contain er mt-3">
			<h3>Classe: Solicitante</h3>
			<table class="table table-dark table-striped">
				<thead>
					<tr>
						<th>Atributo</th>
						<th>Tipo</th>
						<th>Descrição</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>descicao</td>
						<td>String</td>
						<td>Descrição do endereco do solicitante</td>
					</tr>
					<tr>
						<td>data</td>
						<td>LocalDateTime</td>
						<td>Data de realização do pedido</td>
					</tr>
					<tr>
						<td>web</td>
						<td>boolean</td>
						<td>Indicativo para um pedido online ou presencial</td>
					</tr>
				</tbody>
			</table>
		</div>

	
</body>
</html>