# -*- coding: utf-8 -*-

def valido(ip):
  for numeros in ip.split('.'):
    if int(numeros) > 255:
      return False
  return True

lista_ip = ['200.135.80.9', '192.168.1.1', '8.35.67.74', '257.32.4.5', '85.345.1.2', '1.2.3.4', '9.8.234.5', '192.168.0.256']
with open('ips.txt', 'w') as ips_entrada:
  ips_entrada.writelines('\n'.join(lista_ip))

with open('ips.txt') as ips:
  validos = []
  invalidos = []
  for ip in ips:
    ip = ip.strip('\n')

    if valido(ip):
      validos.append(ip)
    else:
      invalidos.append(ip)

with open('relatorio_ips.txt', 'w') as relatorio:
  relatorio.write('[Endereços válidos:]\n')
  relatorio.writelines('\n'.join(validos))
  relatorio.write('\n\n[Endereços inválidos:]\n')
  relatorio.writelines('\n'.join(invalidos))

arq_relatorio = open('relatorio_ips.txt')
print(arq_relatorio.read())
