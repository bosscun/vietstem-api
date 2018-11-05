import { Request, Response } from 'express';
import * as path from 'path';

module.exports = function urlNotFound() {
  return function raiseUrlNotFoundError(req: Request, res: Response) {
    res.sendFile(path.join(__dirname, '../../client/index.html'));
  };
};
