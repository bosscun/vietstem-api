import * as multer from 'multer';

const upload = multer();

module.exports = function (app: any) {
  // Install a `/` route that returns server status
  const router = app.loopback.Router();
  router.get('/status', app.loopback.status());
  app.use(router);
};
