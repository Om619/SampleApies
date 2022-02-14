using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Specialized;

namespace RestfulDemo.Controllers
{
    [Route("api/Demo")]
    [ApiController]
    public class Demo : ControllerBase
    {
        [HttpPost("GetName")]
        public async Task TestMethod([FromBody]HttpRequestMessage request)
        //public string Hell()
        {
            //return "Hello";
            try
            {
                if (request != null)
                {
                    var test = request.Content.ReadAsStringAsync();
                }
            }
            catch (Exception ex)
            {

            }
        }
    }
}
