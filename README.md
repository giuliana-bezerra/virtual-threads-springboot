<h1 align="center">
  Virtual Threads Spring Boot
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Youtube&message=@giulianabezerra&color=8257E5&labelColor=000000" alt="@giulianabezerra" />
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Demo&color=8257E5&labelColor=000000" alt="Demo" />
</p>

Demo apresentada [nesse vídeo](https://youtu.be/a8gMokxIt4Q) para comparar a abordagem de virtual threads com a de threads de plataforma.

## Teoria
![Explicação](.github/platform_vs_virtual.png)

## Benchmark

Esse teste foi feito num computador que possui 8 núcleos, portanto foram utilizadas 32 threads para comparação.

- Abordagem Platform Threads (32 threads / 8 núcleos = 4 * 3s = 12s):
```
$ hey -n 32 -c 32 http://localhost:8080/demo
```
![Sem Virtual Threads](.github/sem_virtual_threads.png)

- Abordagem Virtual Threads (32 threads virtuais = 3s):
```
hey -n 32 -c 32 http://localhost:8080/demo
```
![Com Virtual Threads](.github/com_virtual_threads.png)