package com.dslplatform.ocd.aggregates.ArrayOptStringInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayOptStringAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayOptString: Array[Option[String]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayOptStringInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayOptStringAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayOptStringAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayOptStringInAggregate.ArrayOptStringAggregate): this.type = {
    this.URI = result.URI;
    this._arrayOptString = result._arrayOptString;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayOptStringInAggregate.ArrayOptStringAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayOptString")
  def arrayOptString = {
    _arrayOptString
  }

  def arrayOptString_= (value: Array[Option[String]]) {
    _arrayOptString = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayOptString") arrayOptString: Array[Option[String]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayOptString = if (arrayOptString == null) Array.empty else arrayOptString)

}

object ArrayOptStringAggregate extends AggregateRootCompanion[ArrayOptStringAggregate]{

  def apply(
    arrayOptString: Array[Option[String]] = Array.empty
  ) = {
    new ArrayOptStringAggregate(
      _locator = None
    , _URI = null
    , _arrayOptString = arrayOptString)
  }

}
