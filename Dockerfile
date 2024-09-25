# 취약점이 있는 오래된 nginx 버전 사용
FROM nginx:1.19

# 루트 권한으로 실행 (보안 문제)
USER root

# 취약한 패키지 설치
RUN apt-get update && apt-get install -y \
    curl \
    vim \
    netcat
