FROM node:22.17.1-alpine3.22

WORKDIR /app

COPY package*.json .

RUN npm install

COPY . .

EXPOSE 5173

CMD ["npm", "run", "dev"]
